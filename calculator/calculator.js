/**
成果物：calculator
作成日：20170929 
更新日：
作成者：Inoue.k
**/

// このJS内で使用する変数・定数宣言
let num = [];
let idx;
let opr;
let err;
const MAX_DIGITS = 9;

// コンストラクタ
class Num{
	constructor(n){
		this.num = n;
		this.flg = false;
	}
}

const disp = t => $("#disp").text(t);

// 処理名：表示分岐
// 真：数値を返す
// 偽：Eを返す
const disp_num = n => disp(err ? "E" : n.num);

// 処理名：クリア
const clear = () =>{
	idx = 0;
	opr = null;
	err = false;
	num[0] = new Num("0");
	num[1] = new Num(NaN);
	disp_num(num[0]);
}

// 処理名：数値押下
// 押下時の数値を配列へ
const click_digit = d =>{
	if(err)return;
	
	const n = num[idx];
	
	try{
		if(!n.flg){
			n.num = d;
			n.flg = (d >= 1);
		}else{
			if(n.num.length >= MAX_DIGITS) throw "overflow";
			n.num += d;
		}
	}catch(e){
		err = true;
	}
	
	disp_num(n);
}

// 処理名：ピリオド
const click_period =() =>{
	if(err) return;
	
	const n = num[idx];
	
	if(!n.flg)n.num = "0";
	
	if(n.num.indexOf(".")<0){
		n.num += ".";
		n.flg = true;
		disp_num(n);
	}
}

// 処理名：計算記号取得
// 入力した計算記号を計算処理へ渡す
const click_operator = o =>{
	if(err) return;
	if(num[1].flg)calculate();
	opr =o;
	idx =1;
	num[1].num = NaN;
	num[1].flg = false;
}

// 処理名：”＝”計算
// 入力した計算記号を計算処理へ渡す
const click_equal = () => {	
	if(err) return;
	if(isNaN(num[1].num)){
	num[1].num = num[0].num;
	num[1].flg = true;
	}
	calculate();
	num[0].flg = false;	
	num[1].flg = false;
	idx=0;
}

// 処理名：計算処理
const calculate = () =>{

	if("+-*/".indexOf(opr)>=0){
		let n;
		try{
			eval(`n=Number(num[0].num)${opr}Number(num[1].num);`);
			// 桁数あふれ対策
			if(!isFinite(n) || isNaN(n)) throw "infinite";
				// オーバーフロー対策
				if(n!=0){
							let k = -Math.ceil(-Math.log10(Math.abs(n)))+1;
							k = k<1 ? 1:k;
							if(k>MAX_DIGITS)throw"overflow";
							let p = 10**(MAX_DIGITS-k);
							n = Math.round(n*p)/p;
				}
			num[0].num = n;
			}catch(e){
				err = true;
				}
				finally{
					disp_num(num[0]);
				}
			}
}
// 処理名：クリックイベント
// HTMLに書かれている数値と計算記号を取得する。
$(() => {
	$(".digit").click(function(){click_digit($(this).attr("digit"));});
	$(".period").click(()=>click_period());
	$(".operator").click(function(){click_operator($(this).attr("operator"));});	
	$(".equal").click(()=>click_equal());
	$(".clear").click(()=>clear());
	clear();
	$("#caption").text("calculator");
});
