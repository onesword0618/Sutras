'���\���ϐ�������������
Dim te(2)
te(0) = "�O�["
te(1) = "�`���L"
te(2) = "�p�["

kachi = 0

Randomize

MsgBox "����񂯂�Q�[���@Ver.1.00 by H.Yazawa"

'5�񏟕�����B
For i = 1 To 5
  '���[�U�[�̎����͂���B
  user = CInt(InputBox("0: �O�[�A1:�`���L�A2:�p�["))

  '�R���s���[�^�̎�𗐐��Ō��߂�
  computer = CInt(Rnd * 2)

  '�o�������\����������쐬����B
  s = "���[�U�[�F" & te(user) & "�A�R���s���[�^�F" & te(computer)

  If user = computer Then
    MsgBox s & "�E�E�E�������ł��I"
  ElseIf computer = (user + 1) Mod 3 Then
    MsgBox s & "�E�E�E���[�U�[�̏����ł��I"
    kachi = kachi + 1
  Else
    MsgBox s &  "�E�E�E�R���s���[�^�̏����ł��I"
  End If
Next

MsgBox "���[�U�[�̏������F"  & kachi
