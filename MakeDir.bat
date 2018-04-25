@echo off
rem 
rem echo 機能を切る

rem バッチのディレクトリを取得
cd /d %~dp0

rem コマンドプロンプト起動時のタイトルを設定する
title MakeDir

set startingFlg=0

rem 存在確認
if exist MakeDir.bat (
    set startingFlg=1
) else (
    echo nothing
)

rem 起動フラグを確認して実行できるかを見る
if %startingFlg% == 1	(
	mkdir ProcessResult
) else (
	echo nothing
)

rem 結果報告
echo ProcessFinish
pause >nul