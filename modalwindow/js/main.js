// �쐬���F20170709
// �X�V���F20170712
// �쐬�ҁFInoue.k

(function() {

  				//�N���XID���g���ėv�f���E��������B
  				var open = document.getElementById('open');
  				var close = document.getElementById('close');
  				var modal = document.getElementById('modal');
  				var mask = document.getElementById('mask');
  				
  				//�N���b�N���̃C�x���g
  				//����F�J��
  				open.addEventListener('click', function() {
  				  modal.className = '';
  				  mask.className = '';
  				});
  				
  				//����F����
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