import axios from 'axios';

const server = "http://revassistant.us-east-2.elasticbeanstalk.com"

export const webappClient = axios.create({
    baseURL: server,
    headers: {
        'Content-Type': 'application/json'
    }
})


export const webappClientAuthorized = axios.create({
    baseURL: server,
    headers: {
        'Content-Type': 'application/json',
        //'Authorization': localStorage.getItem("authorization"),
    }
})