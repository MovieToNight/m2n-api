import {Component} from 'react';

class ErrorHandler extends Component {

    constructor(props) {
        super(props);

        this.state = {
            hasError: false
        }
    }

    static getDerivedStateFromError(error) {
        return {hasError: true};
    }

    render() {
        if (this.hasError) {
            return
        <
            h1 > Something
            went
            wrong < /h1>
        } else {
            return this.props.children
        }
    }
}

export default ErrorHandler;
