@echo off
rem Get DirName.bat's dir path.
rem �u%0�v��u%1�v�ȂǁA�u%�����v�́A������\���A�u0�v�͓��ʂɁA���̃o�b�`�t�@�C�����g�A����ȍ~�͑������A�������ƂȂ�܂��B
rem %~d0	%0���h���C�u���������ɓW�J
rem %~p0	%0���p�X�������ɓW�J
rem %0���h���C�u�����ƃp�X�����ɓW�J���܂��B
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