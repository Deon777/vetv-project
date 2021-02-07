import axios from "axios";

const API_URL = 'https://vetv.herokuapp.com'

export function fetchMembers() {
    return axios(`${API_URL}/team`)
}
