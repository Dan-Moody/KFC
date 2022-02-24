import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class DailyWeather extends Component {
    constructor(props) {
        super(props);
        var days = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
        this.state = {
            days: days,
        }
    }

    // props =  dailys: each days weather
    //          dayOfWeek: current day of week as number
    render() {
        // Iterate through the daily weather and display it
        let days = [];
        for (let i = 0; this.props.dailys && i < 5; i++) {

            // Calculates the day of the week and increments for future days based on i
            let todaysName = this.state.days[(this.props.dayOfWeek + i) % (this.state.days.length)];
            // Get the url for the appropriate day
            let weatherIcon = this.props.dailys[i].weather[0].icon;
            // Get the low temp for the day
            let minTemp = Math.round(this.props.dailys[i].temp.min);
            // Get the high temp for the day
            let maxTemp = Math.round(this.props.dailys[i].temp.max);


            let temp = (
                <div className="weather-block" key={todaysName}>
                    <h2>{todaysName}</h2>
                    <img src={`http://openweathermap.org/img/wn/${weatherIcon}@2x.png`} alt="Weather Icon"></img>
                    <div className='temps'>
                        <span className='lowTemp'>{minTemp +'\u00B0'}</span>
                        <span className='highTemp'>{maxTemp + '\u00B0'}</span>
                    </div>
                </div>
            );
            // console.log(weatherURL);
            days.push(temp);
        }

        return (
            <div>
                {days}
            </div>
            
        )
    }
}

class Forecast extends Component {
    constructor(props) {
        super(props);
        var now = new Date();
        var currentDay = now.getDay();
        this.state = {
            currentDay:  currentDay,
        }
    }

    componentDidMount() {
        fetch('https://api.openweathermap.org/data/2.5/onecall?lat=35.77&lon=-78.63&exclude=current,minutely,hourly,alerts&units=imperial&appid=f833151372ffbc9d11bfb088d9344622')
            .then(res => res.json())
            .then((data) => {
                this.setState({ dailys: data.daily });
                // console.log(data.daily);
            })
            .catch(console.log)
    }

    render() {
        return (
            <DailyWeather 
                dailys={this.state.dailys}
                dayOfWeek={this.state.currentDay}
            />
        )
    }
}

// ========================================

ReactDOM.render(
    <Forecast />,
    document.querySelector('#weather')
);
