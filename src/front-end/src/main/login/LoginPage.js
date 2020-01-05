import {Component} from 'react';

import ErrorHandler from "../error_handler/ErrorHandler";

class LoginPage extends Component {

    constructor(props) {
        super(props);
        this.state = {
            username: '',
            password: '',
            isSignUpClicked: false
        }


    }

    render() {

        return (
            < ErrorHandler >
            < form
        className = "margin"
        onSubmit = {this.onSubmitHandler}
        hidden = {this.state.isSignUpClicked} >
            < div >
            < input
        type = "text"
        placeholder = "Enter Username"
        ref = {this.inputRef}
        required
        value = {this.state.username}
        onChange = {this.changeUsername}
        />
        < input
        type = "password"
        placeholder = "Enter Password"
        required
        value = {this.state.password}
        onChange = {this.changePassword}
        />
        < button
        type = "submit" > Submit < /button>
            < button
        type = "submit"
        onClick = {this.hideMe} > SignUp < /button>
            < /div>

            < /form>
            < /ErrorHandler>
    )
        ;
    }

    changeUsername = (event) => {
        this.setState({
                username: event.target.value
            }
        )
    }

    changePassword = (event) => {
        this.setState({
                password: event.target.value
            }
        )
    }

    onSubmitHandler = event => {
        alert(` ${this.state.username}  ${this.state.password}`)
        event.preventDefault()
    }

    hideMe = () => {
        this.setState({
                isSignUpClicked: true
            }
        )
    }
}

export default LoginPage;
