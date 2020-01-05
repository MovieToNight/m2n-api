import {Component} from 'react';
import store from "../../redux/store";
import Header from "../../header/Header";
import MovieCard from "../cart/MovieCard";
import {Provider} from "react-redux";
import {Helmet} from "react-helmet";
import LinearBuffer from "../loader/LinearBuffer";


class Home extends Component {
    constructor(props) {
        super(props);

        this.state = {
            items: '',
            render: true
        };

        store.subscribe(() => {
            // When state will be updated(in our case, when items will be fetched),
            // we will update local component state and force component to rerender
            // with new data.

            this.setState({
                items: store.getState().selectedType
            });
        });
    }

    componentDidMount() {
        this.setState({
            render: false
        })
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
    }


    render() {
        return (
            < div >
            < Helmet
        bodyAttributes = {
        {
            style: 'background-color : white'
        }
    }>
    <
        meta
        charSet = "utf-8" / >
            < title > Movie2Night < /title>
            < /Helmet>
            < Provider
        store = {store} >
            < Header
        message = 'Movie2Night' / >
            < LinearBuffer
        render = {this.state.render}
        />
        < MovieCard
        store = {store}
        />

        < /Provider>
        < /div>
    )
        ;
    }
}

export default Home;
