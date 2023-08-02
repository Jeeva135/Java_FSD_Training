import SimpleCounter from "./components/SimpleCounter"
import DailyQuote from "./components/DailyQuote"
import GOT from "./components/GOT"

function App() {
  return (
    <div className="container">
      <div className="row">
        <div className="col-sm-12 col-md-12 col-lg-12 p-2">
          {/* <DailyQuote /> */}
          {/* <SimpleCounter /> */}
          <GOT />
        </div>
      </div>
    </div>
  )
}

export default App
