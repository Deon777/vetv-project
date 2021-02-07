import { TeamMember } from "./Types";
import './styles-card.css';

type Props = {
    member: TeamMember
}

function MemberCard({ member } : Props) {
    return (
        <div className = "card-container">

            <div className = "member-img">

            </div>

            <p className = "member-name">
                {member.name}
            </p>

            <p className = "member-function">
                Função: <span className = "response">
                            {member.function}
                        </span>
            </p>

            <p className = "member-formation">
                Formação: <span className = "response">
                            {member.formation}
                          </span>
            </p>
        </div>
    )
}

export default MemberCard;