var goodsCd;

var txtGoodsCd;
var txtGoodsName;
var txtGoodsPrice;


onload = init;
onunload = dbClose;

function init() {
	//�����ݒ������֐�
	txtGoodsCd = document.getElementById("txtGoodsCd");
	txtGoodsName = document.getElementById("txtGoodsName");
	txtGoodsPrice = document.getElementById("txtGoodsPrice");

	txtGoodsCd.onfocus = function (){focus(this);}
	txtGoodsCd.onblur = function (){blur(this);}
	txtGoodsName.onfocus = function (){focus(this);}
	txtGoodsName.onblur = function (){blur(this);}
	txtGoodsPrice.onfocus = function (){focus(this);}
	txtGoodsPrice.onblur = function (){blur(this);}

	document.getElementById("btnInsert").onclick = function (){dataInsert();}
	document.getElementById("btnUpdate").onclick = function (){dataUpdate();}
	document.getElementById("btnDelete").onclick = function (){dataDelete();}
	document.getElementById("linkMaxCd").onclick = function (){return maxCd();}

	dbConnect();
	goodsDisplay();
}


function focus(obj){
	obj.style.backgroundColor = "#ffff00";
}


function blur(obj){
	obj.style.backgroundColor = "#ffffff";
}


function goodsDisplay() {
	//���i��\������֐�

	var mySql = "select GOODS_CD,GOODS_NAME from T06Goods order by GOODS_CD";
	var recordSet = database.Execute(mySql);

	document.getElementById("goodsDisplay").innerHTML = "";

	var tempHtml = "<select name=\"selectGoods\" id=\"selectGoods\">\n";
	tempHtml = tempHtml + "\t<option value=\"0\">�I�����Ă��������B</option>\n";
	while (!recordSet.EOF){
		tempHtml = tempHtml + "\t<option value=\"" + recordSet(0) + "\">" + recordSet(1) + "</option>\n";
		recordSet.MoveNext();
	}
	tempHtml = tempHtml + "</select>";

	//alert(tempHtml);
	document.getElementById("goodsDisplay").innerHTML = tempHtml;
	document.getElementById("selectGoods").onchange = function (){goodsChange(this);}

	recordSet.Close();
	recordSet = null;
}


function goodsChange(obj) {
	//���i��I���������̊֐�
	if(obj.selectedIndex==0){
		textClear();
		document.getElementById("sqlDisplay").innerHTML = "";
		alert("���i��I�����Ă��������B");
	}else{
		goodsCd = Number(obj.value);
		var mySql = "select * from T06Goods where GOODS_CD = " + obj.value ;
		var recordSet = database.Execute(mySql);
	
		txtGoodsCd.value = recordSet(0);
		txtGoodsName.value = recordSet(1);
		txtGoodsPrice.value = recordSet(2);

		recordSet.Close();
		recordSet = null;
	
		sqlDisplay("selectedIndex:" + obj.selectedIndex + "�@value:" + obj.value);
	}
}


function sqlDisplay(_mySql) {
	//SQL��\������֐�
	document.getElementById("sqlDisplay").innerHTML = "<p>" + _mySql + "</p>";
}


function maxCd(){
	//�ő�l���擾����֐�
	var mySql = "select max(GOODS_CD) from T06Goods";
	var recordSet = database.Execute(mySql);
	textClear();
	document.getElementById("sqlDisplay").innerHTML = "";
	goodsDisplay();
	txtGoodsCd.value = recordSet(0) + 1;
	txtGoodsName.focus();
	return false;
}


function textClear() {
	//�e�L�X�g�{�b�N�X���N���A����֐�
	txtGoodsCd.value = "";
	txtGoodsName.value = "";
	txtGoodsPrice.value = "";
}


function dataInsert() {
	//�f�[�^��ǉ�����֐�
	try{
		if(dataCheck(1)){
			var mySql = "insert into T06Goods values(" ;
			mySql = mySql + Number(txtGoodsCd.value) + ",'" + txtGoodsName.value + "'," ;
			mySql = mySql + Number(txtGoodsPrice.value);
			mySql = mySql +")";

			sqlDisplay(mySql);
			database.Execute(mySql);
			goodsDisplay();
			alert("�ǉ����܂����B");

		}
	}catch(error){
		alert(error.number + "\n" + error.description);
	}
}


function dataUpdate() {
	//�f�[�^���X�V����֐�
	if(dataCheck(1)){
		var mySql = "update T06Goods set ";
		mySql = mySql + "GOODS_NAME = '" + txtGoodsName.value + "', ";
		mySql = mySql + "PRICE = " + Number(txtGoodsPrice.value);
		mySql = mySql + " where GOODS_CD = " + Number(txtGoodsCd.value);
		sqlDisplay(mySql);
		database.Execute(mySql);
		goodsDisplay();
		alert("�X�V���܂����B");
	}
}


function dataDelete() {
	//�f�[�^���폜����֐�
	if(!confirm("�{���ɍ폜���܂����H")){
		return ;
	}

	if(dataCheck(0)){
		var mySql = "delete from T06Goods where GOODS_CD = " + Number(txtGoodsCd.value);
		sqlDisplay(mySql);
		database.Execute(mySql);
		textClear();
		goodsDisplay();
		alert("�폜���܂����B");
	}
}


function dataCheck(flag){
	//�f�[�^���`�F�b�N����֐�
	var tempStr = "�͕K�����͂��Ă��������B";

	if (txtGoodsCd.value == "") {
		alert("GOODS_CD" + tempStr);
		return false;
	}
	if (txtGoodsCd.value.match(/[^0-9]/)) {
		alert("GOODS_CD�ɂ͔��p��������͂��Ă��������I");
		txtGoodsCd.focus();
		return false;
	}
	if (flag == 1 && txtGoodsName.value == "") {
		alert("GOODS_NAME" + tempStr);
		return false;
	}
	if (flag == 1 && txtGoodsPrice.value == "") {
		alert("PRICE" + tempStr);
		return false;
	}
	if (flag == 1 && txtGoodsPrice.value.match(/[^0-9]/)) {
		alert("PRICE�ɂ͔��p��������͂��Ă��������I");
		txtGoodsCd.focus();
		return false;
	}

	return true;
}
