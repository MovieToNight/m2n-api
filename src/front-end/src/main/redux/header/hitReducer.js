import {LOADING, SI_FI} from "./dropdownTypes";


const initialState = {
    selectedType: 'Initial state',
    loading: true
}


const hitReducer = (state = initialState, action) => {
    if (action.type === SI_FI) {
        return {
            ...state,
            selectedType: SI_FI
        }
    }

    if (action.type === LOADING) {
        return {
            ...state,
            loading: LOADING
        }
    } else {
        return state;
    }

}

export default hitReducer;
