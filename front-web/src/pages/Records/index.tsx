import React from 'react';
import './styles.css';
const Records = () => (
    <div className="page-container">
        <table className="records-table" cellPadding="0" cellSpacing="0">
            <thead>
                <tr>
                    <th>INSTANTE</th>
                    <th>NOME</th>
                    <th>IDADE</th>
                    <th>PLATAFORMA</th>
                    <th>GÊNERO</th>
                    <th>TÍTULO DO GAME</th>                    
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>13/10/2020</td>
                    <td>Ronaldo</td>
                    <td>33</td>
                    <td>XBOX</td>
                    <td>Ação</td>
                    <td>minority report</td>
                </tr>
            </tbody>
        </table>
    </div>

);

export default Records;