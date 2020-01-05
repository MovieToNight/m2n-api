import {Component} from 'react';
import Popup from "reactjs-popup";
import './Login.css';


class ModelLogin extends Component {
    constructor(props) {
        super(props);
        this.state = {
            showModel: false,
            loading: false,
            error: null
        }
    }


    render() {
        return (
            < div >
            < Popup
        trigger = { < button
        className = "myButton" > Open
        Modal < /button>} modal>
        {
            close => (
                < div
            className = "modal" >
                < a
            className = "close"
            onClick = {close} >
                & times;
        <
            /a>
            < div
            className = "header" > Modal
            Title < /div>
            < div
            className = "content" >

                < /div>
                < div
            className = "actions" >
                < Popup
            trigger = { < button
            className = "myButton" > Trigger < /button>}
            position = "top center"
            closeOnDocumentClick
            >
            < span >
            Lorem
            ipsum
            dolor
            sit
            amet, consectetur
            adipisicing
            elit.Beatae
            magni
            omnis
            delectus
            nemo, maxime
            molestiae
            dolorem
            numquam
            mollitia, voluptate
            ea, accusamus
            excepturi
            deleniti
            ratione
            sapiente
            !Laudantium, aperiam
            doloribus.Odit, aut.
            < /span>
            < /Popup>
            < button
            className = "myButton"
            onClick = {()
        =>
            {
                console.log("modal closed ");
                close();
            }
        }
        >
            close
            modal
            < /button>
            < /div>
            < /div>
        )
        }
    <
        /Popup>
        < /div>
    )
        ;
    }
}

export default ModelLogin;
