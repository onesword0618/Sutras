// 作成日：20170709
// 更新日：20170712
// 作成者：Inoue.k

(function() {

  				//クラスIDを使って要素を拾いあげる。
  				var open = document.getElementById('open');
  				var close = document.getElementById('close');
  				var modal = document.getElementById('modal');
  				var mask = document.getElementById('mask');
  				
  				//クリック時のイベント
  				//動作：開く
  				open.addEventListener('click', function() {
  				  modal.className = '';
  				  mask.className = '';
  				});
  				
  				//動作：閉じる
  				close.addEventListener('click', function() {
  				  modal.className = 'hidden';
  				  mask.className = 'hidden';
  				});

  				mask.addEventListener('click', function() {
  				  // modal.className = 'hidden';
  				  // mask.className = 'hidden';
  				  close.click();
  				});
})();