import React from 'react'
import Theme from './components/Theme'

function App() {
  const [textColor, setTextColor] = React.useState('light');
  const [bgColor, setBgColor] = React.useState('dark');
  return (
    <ThemeProvider.Provider value={{ textColor, setTextColor, bgColor, setBgColor }}>
      <Theme />
    </ThemeProvider.Provider>
  )
}
export default App
