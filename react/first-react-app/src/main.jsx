import React from 'react'
import ReactDOM from 'react-dom/client'
// import App from './App.jsx'
import './index.css'
import Title from './components/Title'
import Introduction from './components/Introduction'
import List from './components/List'

ReactDOM.createRoot(document.getElementById('root')).render(
  <>
    <Title/>
    <Introduction/>
    <List/>
  </>,
)


