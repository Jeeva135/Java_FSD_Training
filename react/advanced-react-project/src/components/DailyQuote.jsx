import React, { useEffect, useState } from 'react'
import axios from 'axios'

const DailyQuote = () => {

  const [quotes, setQuotes] = useState(null)
  const [index, setIndex] = useState(0)

  useEffect(() => {
    console.log('effect')
    axios.get('https://type.fit/api/quotes')
      .then((response) => {
        if (response.status === 200) {
          setQuotes(response.data)
        }
      })
      .catch(error => console.error(error))
  }, [])

  const nextQuote = () => {
    setIndex(prevIndex => prevIndex + 1)
  }

  return (
    quotes &&
    <>
      <div className="card w-75 mb-3">
        <div className="card-body">
          <h5 className="card-title">Quote of the Day</h5>
          <p className="card-text"> {quotes[index].text} </p>
          <p className="card-text"> <small className="text-body-secondary">{quotes[index].author}</small> </p>
          <button className="btn btn-primary" onClick={nextQuote}>Nex Quote</button>
        </div>
      </div>

    </>
  )
}

export default DailyQuote