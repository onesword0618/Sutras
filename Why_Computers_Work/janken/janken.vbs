'手を表す変数を初期化する
Dim te(2)
te(0) = "グー"
te(1) = "チョキ"
te(2) = "パー"

kachi = 0

Randomize

MsgBox "じゃんけんゲーム　Ver.1.00 by H.Yazawa"

'5回勝負する。
For i = 1 To 5
  'ユーザーの手を入力する。
  user = CInt(InputBox("0: グー、1:チョキ、2:パー"))

  'コンピュータの手を乱数で決める
  computer = CInt(Rnd * 2)

  '出した手を表す文字列を作成する。
  s = "ユーザー：" & te(user) & "、コンピュータ：" & te(computer)

  If user = computer Then
    MsgBox s & "・・・あいこです！"
  ElseIf computer = (user + 1) Mod 3 Then
    MsgBox s & "・・・ユーザーの勝ちです！"
    kachi = kachi + 1
  Else
    MsgBox s &  "・・・コンピュータの勝ちです！"
  End If
Next

MsgBox "ユーザーの勝ち数："  & kachi
