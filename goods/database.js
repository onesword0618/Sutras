var database;

function dbConnect() {
	//�f�[�^�x�[�X�ɐڑ�����֐�
	database = new ActiveXObject("ADODB.Connection");
	database.Open("Driver={Microsoft Access Driver (*.mdb)}; DBQ=c:\\SampleDB010.mdb;");
	//alert("�f�[�^�x�[�X�ɐڑ����܂����B");
}


function dbClose() {
	//�f�[�^�x�[�X��ؒf����֐�
	database.Close();
	database = null;
	//alert("�f�[�^�x�[�X��ؒf���܂����B");
}


function addressRefer(townCd,_database) {
	//�Z����\������֐�
	var mySql = "SELECT ('��' & ZIP_CODE & ' ' & PREF_NAME & CITY_NAME & TOWN_NAME) AS address ";
	mySql = mySql + "FROM T03Town,T02City,T01Prefecture ";
	mySql = mySql + "WHERE T03Town.CITY_CD = T02City.CITY_CD ";
	mySql = mySql + "AND T02City.PREF_CD = T01Prefecture.PREF_CD ";
	mySql = mySql + "AND TOWN_CD = " + townCd;

	var recordSet = _database.Execute(mySql);
	var tempAddress = recordSet(0);


	//recordSet.Close();
	recordSet = null;

	return tempAddress;
}


function dateFormat(_date) {
	//���t���uyyyy/mm/dd�v�ŕԂ��֐�
		var date = new Date(_date);

		var year = date.getYear();
		year = (year > 99)? year : year + 1900;

		var month =date.getMonth() + 1;
		month = (month >= 10)? month : "0" + month;

		var day = date.getDate();
		day = (day >= 10)? day : "0" + day;

		var tempDate = year + "/" + month + "/" + day;
		return tempDate;
}
