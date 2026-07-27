function ListofIndianPlayers(props) {
    return (
        <div>
            {props.IndianPlayers.map((item) => {
                return <li key={item}>Mr.{item}</li>;
            })}
        </div>
    );
}
export default ListofIndianPlayers;