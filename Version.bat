@echo off
rem Windows��version�m�F
rem echo �@�\��؂�

rem �o�b�`�̃f�B���N�g�����擾
cd /d %~dp0

rem �R�}���h�v�����v�g�N�����̃^�C�g����ݒ肷��
title CheckWindowsVersion

rem ���݊m�F
if exist Version.bat (
    ver > ProcessResult.txt
) else (
    echo nothing
)

rem ���ʕ�
echo �������I�����܂����B�t�@�C�����m�F���Ă��������B
pause >nul
