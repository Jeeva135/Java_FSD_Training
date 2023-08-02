import React, { useState, useEffect } from 'react'
import axios from 'axios'

const GOT = () => {

    const [wikia, setWikia] = useState(null)
    const [index, setIndex] = useState(0)

    useEffect(() => {
        axios.get('https://thronesapi.com/api/v2/Characters/' + index)
            .then(response => {
                if (response.status === 200) {
                    setWikia(response.data)
                }
            })
            .catch(error => console.error(error))
    }, [index])

    const next = () => {
        setIndex(prevIndex => prevIndex + 1)
    }
    return (
        wikia &&
        <div className="card mb-3" >
            <div className="row g-0">
                <div className="col-md-4">
                    <img src={wikia.imageUrl} className="img-fluid rounded-start" alt="image" />
                </div>
                <div className="col-md-4">
                    <div className="card-body">
                        <h5 className="card-title">{wikia.fullName}</h5>
                        <p className="card-text">
                            <small className="text-body-secondary">Last updated 3 mins ago</small>
                        </p>
                        <p>
                            <button className="btn btn-lg btn-primary" onClick={next}>Next Character</button>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default GOT