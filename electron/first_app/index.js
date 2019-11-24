// first app
const { app, BrowserWindow } = require('electron')
let win

function createWindow() {
	const  WIDTH = 800
	const HEGHT = 600
	const URL = 'file:///home/onesword0618/src/sutras/electron/first_app/index.html'

	win = new BrowserWindow(
		{ width: WIDTH
			, heght: HEGHT
		})

		win.loadURL(URL)
		win.on('closed', () => { win = null })
	}

	app.on('ready',createWindow)
	app.on('window-all-closed', () => {
		if ( process.platform !== 'darwin' ) {
			app.quit()}
		})

		app.on('active', () => {
			if ( win === null) {
				createWindow()
			}
		})
