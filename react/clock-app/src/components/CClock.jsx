import React from "react";

class CClock extends React.Component {
    constructor(){
        super()
        this.state={
            date:new Date()
        }
    }
    updateClock(){
        this.setState({date:new Date()})
    }
    componentDidMount(){
        this.timer=setInterval(()=>this.updateClock(),1000)
    }
    componentWillUnmount(){
        clearInterval(this.timer)
    }
    render() {
        return (
        <p>{this.state.date.toLocaleTimeString("en-US")}</p>
        )
    }
}

export default CClock