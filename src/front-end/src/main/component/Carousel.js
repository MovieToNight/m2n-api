import {Component} from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import Carousel from "react-bootstrap/Carousel";


class MyCarousel extends Component {
    render() {
        return (
            < Carousel >
            < Carousel.Item >
            < img
        className = "d-block w-100"
        src = {require('./image_800x474.jpg'
    )
        +"/?text=hi a&bg=282c34"
    }
        thumbnail
        alt = "First slide"
        height = "300"
        width = "100"
            / >
            < Carousel.Caption >
            < h3 > First
        slide
        label < /h3>
        < p > Nulla
        vitae
        elit
        libero, a
        pharetra
        augue
        mollis
        interdum. < /p>
        < /Carousel.Caption>
        < /Carousel.Item>


        < Carousel.Item >
        < img
        className = "d-block w-100"
        src = {require('./image_800x474.jpg'
    )
        +"/?text=hi a&bg=282c34"
    }
        alt = "First slide"
        height = "300"
        width = "100"
            / >

            < Carousel.Caption >
            < h3 > Second
        slide
        label < /h3>
        < p > Lorem
        ipsum
        dolor
        sit
        amet, consectetur
        adipiscing
        elit. < /p>
        < /Carousel.Caption>
        < /Carousel.Item>

        < /Carousel>
    )
        ;
    }
}

export default MyCarousel;
