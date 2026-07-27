import { useState } from 'react';
import './App.css';

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function UserGreeting(props) {
  return <h2>Welcome back</h2>;
}

function GuestGreeting(props) {
  return <h2>Please sign up.</h2>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  function handleLoginClick() {
    setIsLoggedIn(true);
  }

  function handleLogoutClick() {
    setIsLoggedIn(false);
  }

  return (
    <div>
      <Greeting isLoggedIn={isLoggedIn} />

      {isLoggedIn ? (
        <div>
          <p>Book your tickets here</p>
          <LogoutButton onClick={handleLogoutClick} />
        </div>
      ) : (
        <div>
          <p>Flight details: Chennai to Bangalore, 10:00 AM</p>
          <LoginButton onClick={handleLoginClick} />
        </div>
      )}
    </div>
  );
}

export default App;