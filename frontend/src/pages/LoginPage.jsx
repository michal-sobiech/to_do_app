import { Button, FormLabel, TextField } from '@mui/material';
import { Box, Container } from "@mui/system";


export function GetLoginPage() {
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
                <Button>Log in</Button>
                <FormLabel sx={{mx:2, mt: 2}}>
                    Not a member yet?
                </FormLabel>
                <Button>
                    Sign up
                </Button>
            </Box>
        </Container>
    );

}