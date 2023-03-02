import { Button, TextField, FormLabel } from '@mui/material';
import { Box, Container } from "@mui/system";
import { useNavigate } from 'react-router-dom';


export function GetSignUpPage() {
    let navigate = useNavigate();
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
                    id='name-text-field'
                    label='Name'
                    sx={
                        {
                            mx: 2,
                            mt: 2
                        }
                    }
                />
                <TextField 
                    id='surname-text-field'
                    label='Surname'
                    sx={
                        {
                            mx: 2,
                            mt: 2,
                        }
                    }
                />
                 <TextField 
                    id='email-text-field'
                    label='E-mail'
                    sx={
                        {
                            mx: 2,
                            mt: 2
                        }
                    }
                />
                <TextField 
                    id='password-text-field'
                    label='Password'
                    sx={
                        {
                            mx: 2,
                            mt: 2,
                        }
                    }
                />
                <Button>
                    Sign up
                </Button>
                <FormLabel sx={{mx:2, mt: 2}}>
                    Already a member?
                </FormLabel>
                <Button 
                    onClick={() => {
                        navigate('/');
                    }}>
                    Log in
                </Button>
            </Box>
        </Container>
    );

};