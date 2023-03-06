import { Button, FormLabel, TextField } from '@mui/material';
import { Box, Container } from "@mui/system";
import { useNavigate } from 'react-router-dom';
import { useCookies } from 'react-cookie'


export function GetLoginPage() {

    let navigate = useNavigate();
    const [cookies, setCookies] = useCookies(['jwt_token']);

    async function SendLoginDataPOST(email, password) {
        fetch('http://localhost:8080/logIn', {
            method: 'POST',
            headers: { 
                'Content-Type': 'application/json'
            },
            // body: JSON.stringify({
            //     'username': email,
            //     'password': password
            // })
            body: JSON.stringify({
                'username': 'ms',
                'password': 'password'
            })
        })
        .then(res => res.text())
        .then(res => console.log(res23))
    }

    return (
        <Container>
            <Box 
                sx={
                {
                    width: 300,
                    height: 300,
                    backgroundColor: 'beige'
                }
            }>
                <TextField 
                    id='login-text-field'
                    label='Your login here'
                    sx={
                        {
                            mx: 2,
                            mt: 2
                        }
                    }
                />
                <TextField 
                    id='password-text-field'
                    label='Your password here'
                    sx={
                        {
                            mx: 2,
                            mt: 2,
                        }
                    }
                />
                <Button 
                    onClick={() => {
                        // let promise = new Promise(())
                        SendLoginDataPOST('test_email', 'test_password');
                        // navigate('/home');
                    }}>
                    Log in
                </Button>
                <FormLabel sx={{mx:2, mt: 2}}>
                    Not a member yet?
                </FormLabel>
                <Button 
                    onClick={() => {
                        navigate('/signUp');
                    }}>
                    Sign up
                </Button>
            </Box>
        </Container>
    );

}