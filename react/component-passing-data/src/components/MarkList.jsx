import React from "react";

const MarkList = (props) => {
    return (
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Marks</th>
                </tr>
            </thead>
            <tbody>
                {
                    props.values.map(element => {
                        return (
                            <tr>
                                <td>{element.name}</td>
                                <td>{element.age}</td>
                                <td>{element.marks}</td>
                            </tr>
                        )
                    }
                    )
                }
            </tbody>
        </table>
    )
}
export default MarkList