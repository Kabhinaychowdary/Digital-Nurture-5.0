import officeImg from './assets/office.png';
import './App.css';

function App() {
  const element = "Office Space";
  const jsxatt = <img src={officeImg} width="25%" height="25%" alt="Office Space" />;
  const ItemName = { Name: "DBS", Rent: 50000, Address: "Chennai" };

  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "Prestige", Rent: 75000, Address: "Bangalore" },
    { Name: "Skyline", Rent: 45000, Address: "Hyderabad" }
  ];

  return (
    <div>
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}

      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors[0]}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>

      <hr />

      {officeList.map((item, index) => {
        let color = item.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index}>
            <h1>Name: {item.Name}</h1>
            <h3 className={color}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;