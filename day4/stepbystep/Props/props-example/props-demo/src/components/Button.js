function Button(props) {
    return (
        <div>
            <label for={props.id}>{props.description}</label>
            <button id={props.id}>{props.text}</button>
        </div>
    )
}

export default Button;