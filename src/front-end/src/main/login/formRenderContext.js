import React from "react";

const formRender = React.createContext();

const provide = formRender.Provider
const consumer = formRender.Consumer

export {provide, consumer}
