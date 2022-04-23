import axios from 'axios'

const PROJECT_URL = 'http://localhost:8080/project_mng/project';

class Project {

    findAll(){
        return axios.get(PROJECT_URL);
    }
}

export default new Project();