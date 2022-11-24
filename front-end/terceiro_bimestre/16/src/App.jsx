import { useState } from 'react'
import { BrowserRouter, Routes, Route,  } from 'react-router-dom'
import Home from "./pages/Home/index"
import Contact from "./pages/Contact/index"
import PageNotFound from './pages/PageNotFound/index'



const RoutesConfig = () => {


  return (
    <BrowserRouter>
      <Routes>
        <Route path="/"  element={<Home/>} />
        <Route path="/contact" element={<Contact />} />
        <Route path="*" element={<PageNotFound />} />
      </Routes>

     </BrowserRouter>

  )
}

export default RoutesConfig
