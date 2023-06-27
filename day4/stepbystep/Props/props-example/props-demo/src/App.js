import logo from './logo.svg';
import './App.css';
import Button from './components/Button';

function App() {
  return (
    <div className="App">
      <Button text="value" id="unique2" description="special button" />
      <Button text="click" id="unique1" description="regular button" />
    </div>
  );
}

export default App;
