import {BrowserRouter, Route, Routes} from "react-router-dom";
import Main from "./page/Main";
import Test from "./page/Test.jsx";
import TestResult from "./page/TestResult.jsx";

export const base_url = "http://localhost:5173";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                {/* Main Thumbnail List Page */}
                <Route path="/" element={<Main  />} />
                {/* Test Intro-Quiz-Loading Page */}
                <Route path="/:testParam" element={<Test  />} />
                {/* Test Result Page */}
                <Route path="/:testParam/result/:resultParam" element={<TestResult  />} />
            </Routes>
        </BrowserRouter>
    )
}

export default App;


// 주소 체계
// 1. 메인 썸네일 리스트 페이지 : root/
// 2. 테스ㅡ 페이지 - Intro / Quiz / Loading : root/testName
// 3. 결과 페이지 : root/:testName/result/:resultName