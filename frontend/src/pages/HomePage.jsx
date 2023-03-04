import { Box } from "@mui/system";

export function GetHomePage() {
    return <Box>aaaa</Box>
};

async function sendNewEntryPOST(title, description, dateDue, priorityLevel) {
    let JWTToken = 'aaaaa';
    fetch('http://localhost:8080/newEntry', {
        method: 'POST',
        headers: { 
            'Content-Type': 'application/json',
            'Authorization': 'Bearer ' + JWTToken
        },
        body: [title, description, dateDue, priorityLevel]
    });
}