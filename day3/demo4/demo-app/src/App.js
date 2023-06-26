import logo from './logo.svg';
import './App.css';
import SubComp from './components/SubComp/SubComp';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Our application!
        </p>
        <SubComp greeting="hello" />
        <SubComp greeting="hi" />

        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
