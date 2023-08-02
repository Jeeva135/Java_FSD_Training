import React from "react";
import MarkList from "./MarkList";

const marks = [
    { name: 'John Doe', age: 17, marks: 'B' },
    { name: 'Jane Doe', age: 17, marks: 'A' },

]

const MarkRoot = () =>{
    return(
        <MarkList values = {marks}/>
    )
}
export default MarkRoot