import React from "react";
import './RoomStatus.css';

function RoomStatus(){

    const [data,setData] = React.useState(
        [
            { num: 1, type: 'Gold', status: 'Free' },
            { num: 2, type: 'Gold', status: 'Booked' },
            { num: 3, type: 'Gold', status: 'Free' },
            { num: 4, type: 'Gold', status: 'Booked' },
            { num: 5, type: 'Gold', status: 'Free' },
            { num: 6, type: 'Platinum', status: 'Booked' },
            { num: 7, type: 'Platinum', status: 'Booked' },
            { num: 8, type: 'Platinum', status: 'Free' },
            { num: 9, type: 'Platinum', status: 'Booked' },
            { num: 10, type: 'Platinum', status: 'Free' },
            { num: 11, type: 'Diamond', status: 'Free' },
            { num: 12, type: 'Diamond', status: 'Free' },
            { num: 13, type: 'Diamond', status: 'Free' },
            { num: 14, type: 'Diamond', status: 'Free' },
            { num: 15, type: 'Diamond', status: 'Booked' }
        ]
    )

    const typeList=[];

    const groupType = () =>{
        for (let i=0;i<data.length;i++){
            if (typeList.includes(data[i].type)===false){
                typeList.push(data[i].type)
            }
        }
    }
    
    groupType()
    console.log(typeList)

    function updateStatus(el){
        const index=data.indexOf(el);
        setData(prevData =>{
                const updatedData=[...prevData]
                updatedData[index]={
                    ...prevData[index],
                    status:el.status==='Booked'?'Free':'Booked'
                }
                return updatedData;
            }
        )
    }

    return (        
        <div className="container">
            {typeList.map((element,index)=>
                <div className="category" key={index}>
                    <div className="heading">
                        <h1>{element}</h1>
                    </div>
                    <div className="seats">
                        {data.filter((ele)=>ele.type===element).map((e)=>
                            <div className="number">
                                <button onClick={()=>updateStatus(e)} style={
                                    {
                                        backgroundColor:e.status==='Booked'?'blue':'white'
                                        
                                    }
                                }>{e.num}</button>                
                            </div>
                        )}
                    </div>
                </div>
            )}
            
            
            
        </div>
    )
}
export default RoomStatus;