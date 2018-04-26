@echo off
rem Get DirName.bat's dir path.
rem 「%0」や「%1」など、「%数字」は、引数を表し、「0」は特別に、そのバッチファイル自身、それ以降は第一引数、第二引数となります。
rem %~d0	%0をドライブ文字だけに展開
rem %~p0	%0をパス名だけに展開
rem %0をドライブ文字とパスだけに展開します。
cd /d %~dp0

rem Set Title this Bat's name.
title InputName

rem Set up
set useName= %USERNAME% 
rem echo %useName%
set InputName=

rem start?
set /P InputName="Please MasterName?: "

rem exist startUp
if %InputName% == %USERNAME% (
	echo nul > .correct
	echo Welcome Master.
) else (
	echo Who are you?
)

rem result
echo ProcessFinish
pause >nul