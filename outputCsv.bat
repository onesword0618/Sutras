rem outPut
@echo off
dir /w /o:g
echo ****************************
echo output -list
set /p F_NAME_INPUT="What output File name?（.csv入力不要）"
if exist %F_NAME_INPUT%.csv goto :EXTFILE
dir /a:-d-s-h /b /s >> %F_NAME_INPUT%.csv
goto :EOF
:EXTFILE
echo ファイルが既に存在します。再度起動し別の名前を入力してください。
pause
exit 