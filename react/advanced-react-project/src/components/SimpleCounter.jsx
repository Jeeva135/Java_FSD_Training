import React, { useEffect, useState } from 'react'

const SimpleCounter = () => {

  const [count, setCount] = useState(0)

  useEffect(() => {
    document.title = 'The user has clicked ' + count + ' times '
  }, [count])

  const increaseCount = () => {
    setCount(prevState => prevState + 1)
  }

  return (
    <>
      <div className='lead fw-bold'>
        <h2>The user has clicked {count} times.</h2>
        <button className='btn btn-secondary' onClick={increaseCount}>Click me</button>
      </div>
    </>
  )
}

export default SimpleCounter