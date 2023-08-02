import React from 'react';
import CardContents from './CardContents';

function InnerCard() {
    const array = [
        {url:'src/assets/japan.jpg',country:'JAPAN',place:'Mount Fuji',date:'12 Jan,2021-24 Jan,2021',desc:'Mount Fuji is the tallest mountain in Japan, standing at 3,776 meters (12,380 feet). Mount Fuji is the single most popular tourist site in Japan, for both Japanese and foreign tourists.'},
        {url:'src/assets/australia.jpg',country:'AUSTRALIA',place:'Sydney Opera House',date:'27 May,2021-8 Jun,2021',desc:'The Sydney Opera House is a multi-venue performing arts centre in Sydney. Located on the banks of the Sydney Harbour, it is often regarded as one of the 20th centurys most famous and distinctive buildings.'},
        {url:'src/assets/norway.jpg',country:'NORWAY',place:'Geirangerfjord',date:'01 Oct,2021-18 Nov,2021',desc:'The Geiranger Fjord is a fjord in the Sunnmøre region of Møre og Romsdal county, Norway. It is located entirely in the Stranda Municipality.'}
    ]
  return (
    <div>
        <CardContents card = {array} />
    </div>
  )
}
export default InnerCard