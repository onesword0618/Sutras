@echo off
set fname=%TIME::=%
set fname=%fname:~0,6%
set fname=%fname: =0%
set fname=%DATE:/=%_%fname%
type nul > %fname%.txt
start notepad.exe %fname%.txt
exit