import User from "./User";
import { useEffect, useState } from "react";

function UserList() {
    const [users, setUsers] = useState([]);

    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/users')
            .then((response) => response.json())
            .then((data) => setUsers(data));
    }, []);

    return (
        <div>
            {users.map((user) => (
                <User key={user.id} user={user} />
            ))}
        </div>
    );
}

export default UserList;