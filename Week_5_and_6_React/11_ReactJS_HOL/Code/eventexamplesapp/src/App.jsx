import { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  function sayHello() {
    alert("hello member");
  }

  function handleIncrement() {
    setCount(count + 1);
    sayHello();
  }

  function handleDecrement() {
    setCount(count - 1);
  }

  function sayWelcome(message) {
    alert(message);
  }

  function handleClick() {
    alert("I was clicked");
  }

  function handleSubmit() {
    let convertedAmount = amount * 80;
    alert("Converting to: " + currency + " Amount is " + convertedAmount);
  }

  return (
    <div>
      <h3>{count}</h3>
      <button onClick={handleIncrement}>Increment</button>
      <br />
      <button onClick={handleDecrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>

      <h2 className="convertorHeading">Currency Convertor!!!</h2>

      <div>
        <label>Amount: </label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
      </div>
      <div>
        <label>Currency: </label>
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />
      </div>
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default App;