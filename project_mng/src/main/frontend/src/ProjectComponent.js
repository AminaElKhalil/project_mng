import React from 'react';
import Project from './Project';

class ProjectComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            projects:[]
        }
    }

    componentDidMount(){
        Project.findAll().then((response) => {
            this.setState({ projects: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className = "text-center"> Projects List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>

                            <td> Project Id</td>
                            <td> Project Name</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.projects.map(
                                project => 
                                <tr key = {project.id}>
                                     <td> {project.id}</td>   
                                     <td> {project.name}</td> 
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>

        )
    }
}

export default ProjectComponent