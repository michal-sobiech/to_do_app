import { ThemeProvider } from '@emotion/react';
import { Input, Button } from '@mui/material';
import { createTheme } from '@mui/material/styles';
import * as React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, Outlet, RouterProvider } from 'react-router-dom';
import { GetHomePage } from './pages/HomePage';
import { GetLoginPage } from './pages/LoginPage';
import { GetSignUpPage } from './pages/SignUpPage';


const theme = createTheme(
    {
        white: '#FFFFFF',
        beige: '#EBE6E5',
        black: '#000000'
    }
);

const router = createBrowserRouter(
    [{
        path: "/",
        element: (
            <ThemeProvider theme={theme} >
                <Outlet />
            </ThemeProvider>
        ),
        children: [
            {
                path: '/',
                element: <GetLoginPage />
            },
            {
                path: '/signUp',
                element: <GetSignUpPage />
            },
            {
                path: '/home',
                element: <GetHomePage />
            }
        ]
    }]
);

const root = ReactDOM.createRoot(document.getElementById('root'));

// Set the router
root.render(
    <RouterProvider router={router} />
);