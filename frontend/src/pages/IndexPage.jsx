import { Box, Button } from "@mui/material";
import { Container } from "@mui/system";
import { useNavigate } from "react-router-dom";

export function GetIndexPage() {
    
    let navigate = useNavigate();

    function LoginButtonAction() {
        console.log('aaaaaa');
        navigate('/login');
    }

    return (
        <Container>
            <Box>TO DO APP</Box>
            <Button onClick={() => {
                LoginButtonAction()
            }}>
                Log in
            </Button>
        </Container>
    );
}