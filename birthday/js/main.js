function getAge() {
    // ���͒l�̎擾
    var birthday = document.getElementById('birthday').value.split("-");

    // ���t�I�u�W�F�N�g�̍쐬
    var d1 = new Date(birthday[0], birthday[1]-1, birthday[2]);
    var d2 = new Date();

    // �����A�N��̌v�Z
    var diff = d2.getTime() - d1.getTime();
    var daysPast = Math.floor(diff / (1000 * 60 * 60 * 24));
    var age = Math.floor(daysPast / 365.25);

    // ���ʂ̕\��
    document.getElementById('daysPast').innerHTML = daysPast;
    document.getElementById('age').innerHTML = age;
}
